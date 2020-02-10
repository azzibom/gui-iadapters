package by.azzibom.utils.gui.adapters.event.awt;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public interface FocusAdapter extends FocusListener {

    @Override
    default void focusGained(FocusEvent e) { }

    @Override
    default void focusLost(FocusEvent e) { }
}
