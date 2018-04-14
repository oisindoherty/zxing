/*
 * Copyright 2006 Jeremias Maerki
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test.java.com.google.zxing;

import com.google.zxing.Dimension;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the Dimension class.
 */
public final class DimensionTest extends Assert {

  @Test
  public void testDimesionMethods() {
    Dimension dimOne = new Dimension(16, 16);
    Dimension dimTwo = new Dimension(16, 16);
    Dimension dimThree = new Dimension(1, 4);

    try {
        Dimension expectIllegalArg = new Dimension(-1, 0);
        fail("Neither width nor height can be less than zero.");
    } catch (IllegalArgumentException iae) {
        //expected
    }

    try {
        Dimension expectIllegalArg = new Dimension(0, -1);
        fail("Neither width nor height can be less than zero.");
    } catch (IllegalArgumentException iae) {
        //expected
    }

    assert(dimOne.equals(dimTwo) == true);
    assert(dimOne.equals(5) == false);

    assert(dimThree.hashCode() == 32717);

    assert(dimThree.toString().equals("1x4"));
  }
}
