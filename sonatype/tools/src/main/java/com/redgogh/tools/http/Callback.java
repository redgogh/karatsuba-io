package com.redgogh.tools.http;

/* -------------------------------------------------------------------------------- *\
|*                                                                                  *|
|*    Copyright (C) 2023 RedGogh                                                    *|
|*                                                                                  *|
|*    This program is free software: you can redistribute it and/or modify          *|
|*    it under the terms of the GNU General Public License as published by          *|
|*    the Free Software Foundation, either version 3 of the License, or             *|
|*    (at your option) any later version.                                           *|
|*                                                                                  *|
|*    This program is distributed in the hope that it will be useful,               *|
|*    but WITHOUT ANY WARRANTY; without even the implied warranty of                *|
|*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the                 *|
|*    GNU General Public License for more details.                                  *|
|*                                                                                  *|
|*    You should have received a copy of the GNU General Public License             *|
|*    along with this program.  If not, see <https://www.gnu.org/licenses/>.        *|
|*                                                                                  *|
|*    This program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.    *|
|*    This is free software, and you are welcome to redistribute it                 *|
|*    under certain conditions; type `show c' for details.                          *|
|*                                                                                  *|
\* -------------------------------------------------------------------------------- */

/**
 * `Callback` 接口用于处理 HTTP 请求的响应和错误回调。
 *
 * <p>该接口定义了两个方法：`onFailure` 和 `onResponse`，分别用于处理请求失败时的异常
 * 和请求成功时的响应。通常用于异步 HTTP 请求的回调机制中，提供对请求结果的处理逻辑。
 *
 * <p>使用场景包括异步 HTTP 请求、网络请求回调等。
 *
 * <h2>主要功能</h2>
 * <ul>
 *     <li>`onFailure(Throwable e)`：当 HTTP 请求失败时调用，传入引发失败的异常。</li>
 *     <li>`onResponse(Response response)`：当 HTTP 请求成功时调用，传入请求的响应结果。</li>
 * </ul>
 *
 * @author RedGogh
 * @see Response
 * @since 1.0
 */
public interface Callback {

    /**
     * #brief: 处理请求失败的回调
     *
     * <p>该方法在 HTTP 请求失败时被调用，提供引发失败的异常信息。可用于记录错误日志、
     * 提示用户或者进行错误处理等。
     *
     * @param e 请求失败的异常
     */
    void onFailure(Throwable e);

    /**
     * #brief: 处理请求成功的回调
     *
     * <p>该方法在 HTTP 请求成功时被调用，提供请求的响应结果。可用于处理响应数据、
     * 更新 UI 或者进行进一步的业务逻辑处理。
     *
     * @param response 请求成功的响应结果
     */
    void onResponse(Response response);
}
