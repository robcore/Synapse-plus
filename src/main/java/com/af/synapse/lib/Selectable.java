package com.af.synapse.lib;

import android.view.View;

/**
 * Created by Andrei on 24/05/2014.
 */
public interface Selectable extends View.OnLongClickListener {
    void setSelectable(boolean flag);
    void select();
    void deselect();
    boolean isSelected();
}
