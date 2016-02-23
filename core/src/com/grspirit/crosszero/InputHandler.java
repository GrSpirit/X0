package com.grspirit.crosszero;

import com.badlogic.gdx.InputProcessor;
import com.grspirit.crosszero.model.Grid;

/**
 * Created by vita on 21.02.16.
 */
public class InputHandler implements InputProcessor {
    private Grid grid;

    public InputHandler(Grid grid) {
        this.grid = grid;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        if (screenX <= grid.getScreenWidth() && screenY <= grid.getScreenHeight())
            grid.onClick(screenX, screenX);
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
