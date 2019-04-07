package com.lsystems.android.rendering

/**
 * A navigation implementation that does nothing at all
 */
class FixedNavigation: Navigation
{
    /**
     * This navigation does nothing.
     */
    override fun update(delta: Double)
    {
        // Do nothing
    }

    /**
     * This navigation does nothing.
     */
    override fun initialize(c: Camera)
    {
        // Do nothing
    }
}