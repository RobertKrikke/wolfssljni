
/* WolfSSLCustomUser.java
 *
 * Copyright (C) 2006-2019 wolfSSL Inc.
 *
 * This file is part of wolfSSL.
 *
 * wolfSSL is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * wolfSSL is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA
 */

package com.wolfssl;
/**
 * Base class is intended to give some custiming points. Currently it is limited
 * to be invoked from WolfSSLConetx.Create
 *
 * @author  wolfSSL
 * @version 1.1, September 2013
 */
public class WolfSSLCustomUser {
    public long method = 0;
    public String[] list = null;

    /**
     * Set callback for Context attributes, TLS protocol and Cipher lsit
     *
     * @param method       version of TLS method to match 
     * @param list         pointer to available cipher list
     *
     */

    public static WolfSSLCustomUser GetCtxAttributes(long method) {

        WolfSSLCustomUser ctxAttr = new WolfSSLCustomUser();

        /*** 
            custom code 
        ***/

        ctxAttr.method = method;

        return ctxAttr;
    }

} /* end WolfSSL */