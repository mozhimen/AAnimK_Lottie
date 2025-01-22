package com.mozhimen.animk.builder.helpers

import android.view.animation.Animation
import android.view.animation.AnimationSet
import androidx.core.util.forEach
import com.mozhimen.animk.builder.bases.BaseAnimationBuilder
import com.mozhimen.animk.builder.commons.IAnimCreateListener

/**
 * @ClassName AnimationBuilder
 * @Description TODO
 * @Author mozhimen / Kolin Zhao
 * @Date 2022/11/17 23:38
 * @Version 1.0
 */
class AnimationBuilder : BaseAnimationBuilder<AnimationBuilder>() {

    override fun build(): Animation {
        return build(null)
    }

    override fun build(listener: IAnimCreateListener<Animation, AnimationSet>?): Animation {
        val animationSet = AnimationSet(false)
        _types.forEach { _, type ->
            val childAnim = type.build(_animKConfig)
            if (childAnim.isFillEnabled) {
                animationSet.isFillEnabled = true
            }
            if (childAnim.fillBefore) {
                animationSet.fillBefore = true
            }
            if (childAnim.fillAfter) {
                animationSet.fillAfter = true
            }
            listener?.onAnimCreated(childAnim)
            animationSet.addAnimation(childAnim)
        }
        listener?.onAnimSetCreated(animationSet)
        return animationSet
    }
}