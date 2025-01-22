package com.mozhimen.animk.builder.impls

import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import androidx.annotation.FloatRange
import com.mozhimen.animk.builder.bases.BaseAnimationType
import com.mozhimen.animk.builder.mos.MAnimKConfig

/**
 * @ClassName AnimationAlphaType
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/4/24
 * @Version 1.0
 */
open class AnimationAlphaType : BaseAnimationType<AnimationAlphaType>(){
    protected var _alphaFrom = 0f
    protected var _alphaTo = 1f

    fun setAlpha(@FloatRange(from = 0.0, to = 1.0) fromAlpha: Float, @FloatRange(from = 0.0, to = 1.0) toAlpha: Float): AnimationAlphaType {
        _alphaFrom = fromAlpha
        _alphaTo = toAlpha
        return this
    }

    fun show(): AnimationAlphaType {
        _alphaFrom = 0f
        _alphaTo = 1f
        return this
    }

    fun hide(): AnimationAlphaType {
        _alphaFrom = 1f
        _alphaTo = 0f
        return this
    }

    override fun build(animKConfig: MAnimKConfig): Animation {
        val animation = AlphaAnimation(_alphaFrom, _alphaTo)
        format(animKConfig, animation)
        return animation
    }

    //////////////////////////////////////////////////////

    companion object {
        val SHOW: AnimationAlphaType = AnimationAlphaType().show()

        val HIDE: AnimationAlphaType = AnimationAlphaType().hide()
    }
}