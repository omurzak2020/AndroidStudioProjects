package com.landenlabs.flipanimation;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.view.View;

/**
 * Copyright (c) 2015 Dennis Lang (LanDen Labs) landenlabs@gmail.com
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * @author Dennis Lang  (3/23/2015)
 * @see http://home.comcast.net/~lang.dennis/
 *
 */

/**
 * Helper class with UI utiity functions.
 */
public class Ui {

    @SuppressWarnings("unchecked")
    public static final <E extends View> E viewById(View rootView, int id) {
        return (E) rootView.findViewById(id);
    }

    public static final <E extends View> E viewById(Activity rootView, int id) {
        return (E) rootView.findViewById(id);
    }


    public static final <E extends View> E viewById(FragmentActivity fact, int id) {
        return (E) fact.findViewById(id);
    }
}