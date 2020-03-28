/**
 *
 * Copyright © 2020 Jordan Lira de Araujo Junior
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the “Software”), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package com.araujo.jordan.excuseme.model

import android.content.Context
import java.lang.ref.WeakReference

/**
 * Data class that hold the permissions results.
 */
data class PermissionStatusWithWorkaround(
    override var granted: MutableList<String> = mutableListOf(),
    override var denied: MutableList<String> = mutableListOf(),
    override var askGently: MutableList<String> = mutableListOf(),
    var weakReference: WeakReference<Context>
) : PermissionStatus(granted, denied, askGently) {
    /**
     * If the permission is denied, show a dialog that can redirect the user to the permissions
     * settings screen, to let the user enable the permission manually.
     *
     * @return PermissionStatus object that holds the result with the granted/refused permissions
     */
    suspend fun please() {

    }
}