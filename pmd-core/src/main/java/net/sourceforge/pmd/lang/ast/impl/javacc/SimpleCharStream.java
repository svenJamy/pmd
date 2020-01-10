/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.ast.impl.javacc;

/**
 *
 */
public class SimpleCharStream extends JavaCharStream {

    public SimpleCharStream(String fulltext, JavaccTokenDocument document) {
        super(fulltext, document);
    }

    @Override
    protected boolean doEscape() {
        return false;
    }
}
