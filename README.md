# int-to-words

Converts given int to English wordy pronunciation.

See IntToWords.java for implementation, IntToWordsTest.java for tests.

Notice that it would probably be easy to expand the code to work with
a larger range of integers simply by adding new constants to the
`limits` and `limitStrings` variables, then increasing the `MAX`
accordingly.

Likewise, to support negative integers, simply add `"minus "` to the
beginning of `intToWords(-x)`, and set `MIN` to be equal to
`-MAX`. However, `Integer.MIN_VALUE` may be problematic here since
`-Integer.MIN_VALUE == Integer.MAX_VALUE+1` which would cause an
overflow.
