package com.mozhimen.animk.builder.commons

import android.view.animation.Animation
import com.mozhimen.animk.builder.mos.MAnimKConfig

/**
 * @ClassName IAnimationType
 * @Description TODO
 * @Author mozhimen / Kolin Zhao
 * @Version 1.0
 */
interface IAnimationType : IAnimType<Animation> {
    override fun format(animKConfig: MAnimKConfig, anim: Animation) {
        anim.fillBefore = animKConfig.fillBefore
        anim.fillAfter = animKConfig.fillAfter
        anim.duration = animKConfig.duration
    }
}