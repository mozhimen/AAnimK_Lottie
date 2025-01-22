package com.mozhimen.animk.builder.commons

/**
 * @ClassName IAnimatorUpdateListener
 * @Description TODO
 * @Author mozhimen / Kolin Zhao
 * @Date 2022/11/20 22:53
 * @Version 1.0
 */
interface IAnimatorUpdateListener<T> {
    fun onChange(value: T?)
}