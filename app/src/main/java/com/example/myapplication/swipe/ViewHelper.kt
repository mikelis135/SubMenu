package com.example.myapplication.swipe


import android.view.View

import com.nineoldandroids.view.animation.AnimatorProxy.NEEDS_PROXY
import com.nineoldandroids.view.animation.AnimatorProxy.wrap

object ViewHelper {

    fun getAlpha(view: View): Float {
        return if (NEEDS_PROXY) wrap(view).alpha else ViewHelper.Honeycomb.getAlpha(view)
    }

    fun setAlpha(view: View, alpha: Float) {
        if (NEEDS_PROXY) {
            wrap(view).alpha = alpha
        } else {
            ViewHelper.Honeycomb.setAlpha(view, alpha)
        }
    }

    fun getPivotX(view: View): Float {
        return if (NEEDS_PROXY) wrap(view).pivotX else ViewHelper.Honeycomb.getPivotX(view)
    }

    fun setPivotX(view: View, pivotX: Float) {
        if (NEEDS_PROXY) {
            wrap(view).pivotX = pivotX
        } else {
            ViewHelper.Honeycomb.setPivotX(view, pivotX)
        }
    }

    fun getPivotY(view: View): Float {
        return if (NEEDS_PROXY) wrap(view).pivotY else ViewHelper.Honeycomb.getPivotY(view)
    }

    fun setPivotY(view: View, pivotY: Float) {
        if (NEEDS_PROXY) {
            wrap(view).pivotY = pivotY
        } else {
            ViewHelper.Honeycomb.setPivotY(view, pivotY)
        }
    }

    fun getRotation(view: View): Float {
        return if (NEEDS_PROXY) wrap(view).rotation else ViewHelper.Honeycomb.getRotation(view)
    }

    fun setRotation(view: View, rotation: Float) {
        if (NEEDS_PROXY) {
            wrap(view).rotation = rotation
        } else {
            ViewHelper.Honeycomb.setRotation(view, rotation)
        }
    }

    fun getRotationX(view: View): Float {
        return if (NEEDS_PROXY) wrap(view).rotationX else ViewHelper.Honeycomb.getRotationX(view)
    }

    fun setRotationX(view: View, rotationX: Float) {
        if (NEEDS_PROXY) {
            wrap(view).rotationX = rotationX
        } else {
            ViewHelper.Honeycomb.setRotationX(view, rotationX)
        }
    }

    fun getRotationY(view: View): Float {
        return if (NEEDS_PROXY) wrap(view).rotationY else ViewHelper.Honeycomb.getRotationY(view)
    }

    fun setRotationY(view: View, rotationY: Float) {
        if (NEEDS_PROXY) {
            wrap(view).rotationY = rotationY
        } else {
            ViewHelper.Honeycomb.setRotationY(view, rotationY)
        }
    }

    fun getScaleX(view: View): Float {
        return if (NEEDS_PROXY) wrap(view).scaleX else ViewHelper.Honeycomb.getScaleX(view)
    }

    fun setScaleX(view: View, scaleX: Float) {
        if (NEEDS_PROXY) {
            wrap(view).scaleX = scaleX
        } else {
            ViewHelper.Honeycomb.setScaleX(view, scaleX)
        }
    }

    fun getScaleY(view: View): Float {
        return if (NEEDS_PROXY) wrap(view).scaleY else ViewHelper.Honeycomb.getScaleY(view)
    }

    fun setScaleY(view: View, scaleY: Float) {
        if (NEEDS_PROXY) {
            wrap(view).scaleY = scaleY
        } else {
            ViewHelper.Honeycomb.setScaleY(view, scaleY)
        }
    }

    fun getScrollX(view: View): Int {
        return if (NEEDS_PROXY) wrap(view).scrollX else ViewHelper.Honeycomb.getScrollX(view)
    }

    fun setScrollX(view: View, scrollX: Int) {
        if (NEEDS_PROXY) {
            wrap(view).scrollX = scrollX
        } else {
            ViewHelper.Honeycomb.setScrollX(view, scrollX)
        }
    }

    fun getScrollY(view: View): Float {
        return if (NEEDS_PROXY) wrap(view).scrollY.toFloat() else ViewHelper.Honeycomb.getScrollY(
            view
        )
    }

    fun setScrollY(view: View, scrollY: Int) {
        if (NEEDS_PROXY) {
            wrap(view).scrollY = scrollY
        } else {
            ViewHelper.Honeycomb.setScrollY(view, scrollY)
        }
    }

    fun getTranslationX(view: View): Float {
        return if (NEEDS_PROXY) wrap(view).translationX else ViewHelper.Honeycomb.getTranslationX(
            view
        )
    }

    fun setTranslationX(view: View, translationX: Float) {
        if (NEEDS_PROXY) {
            wrap(view).translationX = translationX
        } else {
            ViewHelper.Honeycomb.setTranslationX(view, translationX)
        }
    }

    fun getTranslationY(view: View): Float {
        return if (NEEDS_PROXY) wrap(view).translationY else ViewHelper.Honeycomb.getTranslationY(
            view
        )
    }

    fun setTranslationY(view: View, translationY: Float) {
        if (NEEDS_PROXY) {
            wrap(view).translationY = translationY
        } else {
            ViewHelper.Honeycomb.setTranslationY(view, translationY)
        }
    }

    fun getX(view: View): Float {
        return if (NEEDS_PROXY) wrap(view).x else ViewHelper.Honeycomb.getX(view)
    }

    fun setX(view: View, x: Float) {
        if (NEEDS_PROXY) {
            wrap(view).x = x
        } else {
            ViewHelper.Honeycomb.setX(view, x)
        }
    }

    fun getY(view: View): Float {
        return if (NEEDS_PROXY) wrap(view).y else ViewHelper.Honeycomb.getY(view)
    }

    fun setY(view: View, y: Float) {
        if (NEEDS_PROXY) {
            wrap(view).y = y
        } else {
            ViewHelper.Honeycomb.setY(view, y)
        }
    }

    private object Honeycomb {
        internal fun getAlpha(view: View): Float {
            return view.alpha
        }

        internal fun setAlpha(view: View, alpha: Float) {
            view.alpha = alpha
        }

        internal fun getPivotX(view: View): Float {
            return view.pivotX
        }

        internal fun setPivotX(view: View, pivotX: Float) {
            view.pivotX = pivotX
        }

        internal fun getPivotY(view: View): Float {
            return view.pivotY
        }

        internal fun setPivotY(view: View, pivotY: Float) {
            view.pivotY = pivotY
        }

        internal fun getRotation(view: View): Float {
            return view.rotation
        }

        internal fun setRotation(view: View, rotation: Float) {
            view.rotation = rotation
        }

        internal fun getRotationX(view: View): Float {
            return view.rotationX
        }

        internal fun setRotationX(view: View, rotationX: Float) {
            view.rotationX = rotationX
        }

        internal fun getRotationY(view: View): Float {
            return view.rotationY
        }

        internal fun setRotationY(view: View, rotationY: Float) {
            view.rotationY = rotationY
        }

        internal fun getScaleX(view: View): Float {
            return view.scaleX
        }

        internal fun setScaleX(view: View, scaleX: Float) {
            view.scaleX = scaleX
        }

        internal fun getScaleY(view: View): Float {
            return view.scaleY
        }

        internal fun setScaleY(view: View, scaleY: Float) {
            view.scaleY = scaleY
        }

        internal fun getScrollX(view: View): Int {
            return view.scrollX.toInt()
        }

        internal fun setScrollX(view: View, scrollX: Int) {
            view.scrollX = scrollX
        }

        internal fun getScrollY(view: View): Float {
            return view.scrollY.toFloat()
        }

        internal fun setScrollY(view: View, scrollY: Int) {
            view.scrollY = scrollY
        }

        internal fun getTranslationX(view: View): Float {
            return view.translationX
        }

        internal fun setTranslationX(view: View, translationX: Float) {
            view.translationX = translationX
        }

        internal fun getTranslationY(view: View): Float {
            return view.translationY
        }

        internal fun setTranslationY(view: View, translationY: Float) {
            view.translationY = translationY
        }

        internal fun getX(view: View): Float {
            return view.x
        }

        internal fun setX(view: View, x: Float) {
            view.x = x
        }

        internal fun getY(view: View): Float {
            return view.y
        }

        internal fun setY(view: View, y: Float) {
            view.y = y
        }
    }


}

