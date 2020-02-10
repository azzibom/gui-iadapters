package by.azzibom.utils.gui.adapters.dnd.awt;

import java.awt.dnd.DragSourceListener;
import java.awt.dnd.DragSourceMotionListener;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceDropEvent;

public interface DragSourceAdapter extends DragSourceListener, DragSourceMotionListener {

    @Override
    default void dragEnter(DragSourceDragEvent dsde) { }

    @Override
    default void dragOver(DragSourceDragEvent dsde) { }

    @Override
    default void dropActionChanged(DragSourceDragEvent dsde) { }

    @Override
    default void dragExit(DragSourceEvent dse) { }

    @Override
    default void dragDropEnd(DragSourceDropEvent dsde) { }

    @Override
    default void dragMouseMoved(DragSourceDragEvent dsde) { }
}
