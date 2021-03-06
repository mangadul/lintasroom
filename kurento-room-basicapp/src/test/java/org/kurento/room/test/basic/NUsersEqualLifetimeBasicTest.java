/*
 * (C) Copyright 2015 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the GNU Lesser General Public License (LGPL)
 * version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.kurento.room.test.basic;

import java.lang.invoke.MethodHandles;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.kurento.room.test.browser.NUsersEqualLifetime;
import org.kurento.test.browser.WebPageType;

/**
 * @see NUsersEqualLifetime
 * @author Radu Tom Vlad (rvlad@naevatec.com)
 */
public class NUsersEqualLifetimeBasicTest extends NUsersEqualLifetime {

  @Override
  public void setupBrowserTest() throws InterruptedException {
    webPageType = WebPageType.ROOM;
    super.setupBrowserTest();
  }

  @Parameters(name = "{index}: {0}")
  public static Collection<Object[]> data() {
    return localChromes(MethodHandles.lookup().lookupClass().getSimpleName(), NUM_USERS,
        WebPageType.ROOM);
  }

}
