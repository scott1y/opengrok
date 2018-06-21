/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * See LICENSE.txt included in this distribution for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at LICENSE.txt.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright (c) 2007, 2018, Oracle and/or its affiliates. All rights reserved.
 */

package org.opengrok.indexer.analysis.java;

import org.opengrok.indexer.analysis.FileAnalyzer;
import org.opengrok.indexer.analysis.FileAnalyzer.Genre;
import org.opengrok.indexer.analysis.FileAnalyzerFactory;

public class JavaAnalyzerFactory extends FileAnalyzerFactory {
    
    private static final String name = "Java";
    
    private static final String[] SUFFIXES = {
        "JAVA",
        "AIDL",
        "JAV" // This just supports OpenGrok's own .jav test files
    };

    public JavaAnalyzerFactory() {
        super(null, null, SUFFIXES, null, null, "text/plain", Genre.PLAIN, name);
    }

    @Override
    protected FileAnalyzer newAnalyzer() {
        return new JavaAnalyzer(this);
    }
}
