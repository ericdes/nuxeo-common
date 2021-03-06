/*
 * (C) Copyright 2006-2007 Nuxeo SAS (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Nuxeo - initial API and implementation
 *
 * $Id$
 */

package org.nuxeo.common.xmap;

import org.nuxeo.common.xmap.annotation.XNode;
import org.nuxeo.common.xmap.annotation.XObject;
import org.nuxeo.common.xmap.annotation.XParent;
import org.w3c.dom.Element;

/**
 * @author  <a href="mailto:bs@nuxeo.com">Bogdan Stefanescu</a>
 *
 */
@XObject
public class Name {

    @XParent
    Author owner;

    @XNode("firstName")
    String firstName;

    @XNode("lastName")
    String lastName;

    @XNode("")
    Element myself;

    @Override
    public String toString() {
        return "Name {\n"
                + "  myself: " + myself + '\n'
                + "  owner: " + owner.getClass() + '#' + owner.hashCode() + '\n'
                + "  firstName: " + firstName + '\n'
                + "  lastName: " + lastName + '\n'
                + '}';
    }

}
