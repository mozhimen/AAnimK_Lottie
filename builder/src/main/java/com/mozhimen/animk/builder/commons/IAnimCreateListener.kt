package com.mozhimen.animk.builder.commons

/**
 * @ClassName IAnimKCreateListener
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/4/24
 * @Version 1.0
 */
interface IAnimCreateListener<ANIM, SET> {
    fun onAnimCreated(anim: ANIM)
    fun onAnimSetCreated(animSet: SET)
}