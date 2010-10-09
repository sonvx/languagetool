/* LanguageTool, a natural language style checker 
 * Copyright (C) 2006 Daniel Naber (http://www.danielnaber.de)
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package de.danielnaber.languagetool.tagging.eo;

import java.io.IOException;

import morfologik.stemming.Dictionary;
import morfologik.stemming.DictionaryLookup;
import morfologik.stemming.WordData;

import junit.framework.TestCase;
import de.danielnaber.languagetool.TestTools;
import de.danielnaber.languagetool.tokenizers.WordTokenizer;

public class EsperantoTaggerTest extends TestCase {
  
  private EsperantoTagger tagger;
  private WordTokenizer tokenizer;

  public void setUp() {
    tagger = new EsperantoTagger();
    tokenizer = new WordTokenizer();
  }

  public void testTagger() throws IOException {
    TestTools.myAssert("Tio estas simpla testo",
        "Tio/[null]T nak np t o -- estas/[est]V nt as -- simpla/[simpl]A nak np -- testo/[test]O nak np", tokenizer, tagger);
  }
}
