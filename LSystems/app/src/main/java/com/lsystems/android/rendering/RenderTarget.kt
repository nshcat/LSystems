package com.lsystems.android.rendering

import android.opengl.GLES30
import com.lsystems.android.application.ScreenDimensions

/**
 * An entity that can be rendered to using OpenGL, for example the screen framebuffer or a render
 * target texture
 */
abstract class RenderTarget
{
    /**
     * The current dimensions of the render target. Used to set the OpenGL viewport before rendering.
     */
    protected var renderDimensions: ScreenDimensions = ScreenDimensions.empty()

    /**
     * Force the render target to change its dimensions
     *
     * @param renderDimensions The new dimensions of the render target
     */
    open fun updateDimensions(renderDimensions: ScreenDimensions)
    {
        this.renderDimensions = renderDimensions
    }

    /**
     * Begin rendering to this target. All following render calls will result in this render
     * target being used.
     */
    open fun beginRender()
    {
        // Since there might be any number of render targets in use, we need to always
        // set the OpenGL viewport before rendering
        GLES30.glViewport(0, 0, this.renderDimensions.width, this.renderDimensions.height)
    }

    /**
     * Stop rendering to this target.
     */
    abstract fun endRender()
}

