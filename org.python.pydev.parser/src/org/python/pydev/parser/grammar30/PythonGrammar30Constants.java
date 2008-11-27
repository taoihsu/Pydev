/* Generated By:JJTree&JavaCC: Do not edit this line. PythonGrammar30Constants.java */
package org.python.pydev.parser.grammar30;

public interface PythonGrammar30Constants {

  int EOF = 0;
  int SPACE = 1;
  int CONTINUATION = 4;
  int NEWLINE1 = 5;
  int NEWLINE = 6;
  int NEWLINE2 = 7;
  int CRLF1 = 11;
  int DEDENT = 13;
  int INDENT = 14;
  int TRAILING_COMMENT = 15;
  int SINGLE_LINE_COMMENT = 16;
  int LPAREN = 17;
  int RPAREN = 18;
  int LBRACE = 19;
  int RBRACE = 20;
  int LBRACKET = 21;
  int RBRACKET = 22;
  int SEMICOLON = 23;
  int COMMA = 24;
  int DOT = 25;
  int COLON = 26;
  int PLUS = 27;
  int MINUS = 28;
  int MULTIPLY = 29;
  int DIVIDE = 30;
  int FLOORDIVIDE = 31;
  int POWER = 32;
  int LSHIFT = 33;
  int RSHIFT = 34;
  int MODULO = 35;
  int NOT = 36;
  int XOR = 37;
  int OR = 38;
  int AND = 39;
  int EQUAL = 40;
  int GREATER = 41;
  int LESS = 42;
  int EQEQUAL = 43;
  int EQLESS = 44;
  int EQGREATER = 45;
  int LESSGREATER = 46;
  int NOTEQUAL = 47;
  int PLUSEQ = 48;
  int MINUSEQ = 49;
  int MULTIPLYEQ = 50;
  int DIVIDEEQ = 51;
  int FLOORDIVIDEEQ = 52;
  int MODULOEQ = 53;
  int ANDEQ = 54;
  int OREQ = 55;
  int XOREQ = 56;
  int LSHIFTEQ = 57;
  int RSHIFTEQ = 58;
  int POWEREQ = 59;
  int OR_BOOL = 60;
  int AND_BOOL = 61;
  int NOT_BOOL = 62;
  int IS = 63;
  int IN = 64;
  int LAMBDA = 65;
  int IF = 66;
  int ELSE = 67;
  int ELIF = 68;
  int WHILE = 69;
  int FOR = 70;
  int TRY = 71;
  int EXCEPT = 72;
  int DEF = 73;
  int CLASS = 74;
  int FINALLY = 75;
  int PRINT = 76;
  int PASS = 77;
  int BREAK = 78;
  int CONTINUE = 79;
  int RETURN = 80;
  int YIELD = 81;
  int IMPORT = 82;
  int FROM = 83;
  int DEL = 84;
  int RAISE = 85;
  int GLOBAL = 86;
  int EXEC = 87;
  int ASSERT = 88;
  int AS = 89;
  int WITH = 90;
  int AT = 91;
  int NAME = 92;
  int LETTER = 93;
  int DECNUMBER = 94;
  int HEXNUMBER = 95;
  int OCTNUMBER = 96;
  int FLOAT = 97;
  int COMPLEX = 98;
  int EXPONENT = 99;
  int DIGIT = 100;
  int SINGLE_STRING = 109;
  int SINGLE_STRING2 = 110;
  int TRIPLE_STRING = 111;
  int TRIPLE_STRING2 = 112;
  int SINGLE_USTRING = 113;
  int SINGLE_USTRING2 = 114;
  int TRIPLE_USTRING = 115;
  int TRIPLE_USTRING2 = 116;

  int DEFAULT = 0;
  int FORCE_NEWLINE1 = 1;
  int FORCE_NEWLINE2 = 2;
  int INDENTING = 3;
  int INDENTATION_UNCHANGED = 4;
  int UNREACHABLE = 5;
  int IN_STRING11 = 6;
  int IN_STRING21 = 7;
  int IN_STRING13 = 8;
  int IN_STRING23 = 9;
  int IN_USTRING11 = 10;
  int IN_USTRING21 = 11;
  int IN_USTRING13 = 12;
  int IN_USTRING23 = 13;
  int IN_STRING1NLC = 14;
  int IN_STRING2NLC = 15;
  int IN_USTRING1NLC = 16;
  int IN_USTRING2NLC = 17;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\f\"",
    "<CONTINUATION>",
    "<NEWLINE1>",
    "<NEWLINE>",
    "<NEWLINE2>",
    "\"\\t\"",
    "\" \"",
    "\"\\f\"",
    "<CRLF1>",
    "\"\"",
    "\"\"",
    "\"<INDENT>\"",
    "<TRAILING_COMMENT>",
    "<SINGLE_LINE_COMMENT>",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\";\"",
    "\",\"",
    "\".\"",
    "\":\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"//\"",
    "\"**\"",
    "\"<<\"",
    "\">>\"",
    "\"%\"",
    "\"~\"",
    "\"^\"",
    "\"|\"",
    "\"&\"",
    "\"=\"",
    "\">\"",
    "\"<\"",
    "\"==\"",
    "\"<=\"",
    "\">=\"",
    "\"<>\"",
    "\"!=\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"//=\"",
    "\"%=\"",
    "\"&=\"",
    "\"|=\"",
    "\"^=\"",
    "\"<<=\"",
    "\">>=\"",
    "\"**=\"",
    "\"or\"",
    "\"and\"",
    "\"not\"",
    "\"is\"",
    "\"in\"",
    "\"lambda\"",
    "\"if\"",
    "\"else\"",
    "\"elif\"",
    "\"while\"",
    "\"for\"",
    "\"try\"",
    "\"except\"",
    "\"def\"",
    "\"class\"",
    "\"finally\"",
    "\"print\"",
    "\"pass\"",
    "\"break\"",
    "\"continue\"",
    "\"return\"",
    "\"yield\"",
    "\"import\"",
    "\"from\"",
    "\"del\"",
    "\"raise\"",
    "\"global\"",
    "\"exec\"",
    "\"assert\"",
    "\"as\"",
    "\"with\"",
    "\"@\"",
    "<NAME>",
    "<LETTER>",
    "<DECNUMBER>",
    "<HEXNUMBER>",
    "<OCTNUMBER>",
    "<FLOAT>",
    "<COMPLEX>",
    "<EXPONENT>",
    "<DIGIT>",
    "<token of kind 101>",
    "<token of kind 102>",
    "<token of kind 103>",
    "<token of kind 104>",
    "<token of kind 105>",
    "<token of kind 106>",
    "<token of kind 107>",
    "<token of kind 108>",
    "\"\\\'\"",
    "\"\\\"\"",
    "\"\\\'\\\'\\\'\"",
    "\"\\\"\\\"\\\"\"",
    "\"\\\'\"",
    "\"\\\"\"",
    "\"\\\'\\\'\\\'\"",
    "\"\\\"\\\"\\\"\"",
    "\"\\\\\\r\\n\"",
    "<token of kind 118>",
    "\"\\\\\\r\\n\"",
    "<token of kind 120>",
    "\"\\\\\\r\\n\"",
    "<token of kind 122>",
    "\"\\\\\\r\\n\"",
    "<token of kind 124>",
    "\"\"",
    "\"\"",
    "\"\"",
    "\"\"",
    "<token of kind 129>",
    "<token of kind 130>",
    "\"\\r\\n\"",
    "\"\\n\"",
    "\"\\r\"",
    "<token of kind 134>",
    "<token of kind 135>",
    "\"`\"",
  };

}
