/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.max.internal.exceptions;

/**
 * Will be thrown when there is an attempt to put a new message line into the message processor,
 * but the line starts with an unknown message indicator.
 *
 * @author Christian Rockrohr <christian@rockrohr.de> - Initial contribution
 */
public class UnsupportedMessageTypeException extends Exception {

    /**
     * required variable to avoid IncorrectMultilineIndexException warning
     */
    private static final long serialVersionUID = -5163044407682700913L;

}
