/*
 * Copyright (c) 2006 Sun Microsystems, Inc.  All rights reserved.  U.S.
 * Government Rights - Commercial software.  Government users are subject
 * to the Sun Microsystems, Inc. standard license agreement and
 * applicable provisions of the FAR and its supplements.  Use is subject
 * to license terms.
 *
 * This distribution may include materials developed by third parties.
 * Sun, Sun Microsystems, the Sun logo, Java and J2EE are trademarks
 * or registered trademarks of Sun Microsystems, Inc. in the U.S. and
 * other countries.
 *
 * Copyright (c) 2006 Sun Microsystems, Inc. Tous droits reserves.
 *
 * Droits du gouvernement americain, utilisateurs gouvernementaux - logiciel
 * commercial. Les utilisateurs gouvernementaux sont soumis au contrat de
 * licence standard de Sun Microsystems, Inc., ainsi qu'aux dispositions
 * en vigueur de la FAR (Federal Acquisition Regulations) et des
 * supplements a celles-ci.  Distribue par des licences qui en
 * restreignent l'utilisation.
 *
 * Cette distribution peut comprendre des composants developpes par des
 * tierces parties. Sun, Sun Microsystems, le logo Sun, Java et J2EE
 * sont des marques de fabrique ou des marques deposees de Sun
 * Microsystems, Inc. aux Etats-Unis et dans d'autres pays.
 */


package com.sun.ebank.util;

import java.util.*;
import com.sun.ebank.ejb.exception.*;


/**
 * This helper class methods for getting and checking
 * the domains of business entity variables.
 */
public final class DomainUtil {
    // The accountTypes array stores the valid account types.
    private static String[] accountTypes =
        { "Checking", "Savings", "Credit", "Money Market" };

    public static String[] getAccountTypes() {
        return accountTypes;
    }

    public static void checkAccountType(String type)
        throws IllegalAccountTypeException {
        boolean foundIt = false;

        for (int i = 0; i < accountTypes.length; i++) {
            if (accountTypes[i].equals(type)) {
                foundIt = true;
            }
        }

        if (foundIt == false) {
            throw new IllegalAccountTypeException(type);
        }
    }

    public static boolean isCreditAccount(String type) {
        if (type.equals("Credit")) {
            return true;
        } else {
            return false;
        }
    }
} // DomainUtil