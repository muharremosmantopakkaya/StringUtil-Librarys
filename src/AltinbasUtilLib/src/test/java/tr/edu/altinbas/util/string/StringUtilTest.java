package tr.edu.altinbas.util.string;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runners.Parameterized;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class StringUtilTest {
      private static StringUtil obj = new StringUtil();


      @BeforeAll
      public static void doInitialization()
      {
      }

      @Test
      public void test_isPalindrome_1(){
            assertEquals(Boolean.TRUE,obj.isPalindrome("ege"));



      }
      @Test
      public void test_isPalindrome_2(){
            assertEquals(Boolean.TRUE,obj.isPalindrome("efe"));



      }
      @Test
      public void test_isPalindrome_3(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("para"));


      }
      @Test
      public void test_isPalindrome_4(){
            assertEquals(Boolean.TRUE,obj.isPalindrome("ata"));



      }
      @Test
      public void test_isPalindrome_5(){
            assertEquals(Boolean.TRUE,obj.isPalindrome("ana"));



      }
      @Test
      public void test_isPalindrome_6(){
            assertEquals(Boolean.TRUE,obj.isPalindrome("ece"));



      }
      @Test
      public void test_isPalindrome_7(){
            assertEquals(Boolean.TRUE,obj.isPalindrome("kabak"));



      }
      @Test
      public void test_isPalindrome_8(){
            assertEquals(Boolean.TRUE,obj.isPalindrome("kazak"));



      }
      @Test
      public void test_isPalindrome_9(){
            assertEquals(Boolean.TRUE,obj.isPalindrome("kırık"));



      }
      @Test
      public void test_isPalindrome_10(){
            assertEquals(Boolean.TRUE,obj.isPalindrome("kütük"));



      }
      @Test
      public void test_isPalindrome_11(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("arif"));


      }
      @Test
      public void test_isPalindrome_12(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("messi"));


      }
      @Test
      public void test_isPalindrome_13(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("ronaldo"));


      }
      @Test
      public void test_isPalindrome_14(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("balon"));


      }
      @Test
      public void test_isPalindrome_15(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("fransa"));


      }
      @Test
      public void test_isPalindrome_16(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("derece"));


      }
      @Test
      public void test_isPalindrome_17(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("insan"));


      }
      @Test
      public void test_isPalindrome_18(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("bilgisayar"));


      }
      @Test
      public void test_isPalindrome_19(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("telefon"));


      }
      @Test
      public void test_isPalindrome_20(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("halil"));


      }
      @Test
      public void test_isPalindrome_21(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("kablo"));


      }
      @Test
      public void test_isPalindrome_22(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("okul"));


      }
      @Test
      public void test_isPalindrome_23(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("haluk"));


      }
      @Test
      public void test_isPalindrome_24(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("kelime"));


      }
      @Test
      public void test_isPalindrome_25(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("faruk"));


      }
      @Test
      public void test_isPalindrome_26(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("kenan"));


      }
      @Test
      public void test_isPalindrome_27(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("ahmet"));


      }
      @Test
      public void test_isPalindrome_28(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("eren"));


      }
      @Test
      public void test_isPalindrome_29(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("fare"));


      }
      @Test
      public void test_isPalindrome_30(){
            assertEquals(Boolean.FALSE,obj.isPalindrome("burak"));


      }
      @Test
      public void test_isPangramEN(){
            assertEquals(Boolean.TRUE,obj.isPangramEN(" Six big devils from Japan quickly forgot how to waltz. "));

      }
      @Test
      public void test_isPangramEN2(){
            assertEquals(Boolean.FALSE,obj.isPangramEN(" Six big devils from Japan"));

      }
      @Test
      public void test_isPangramTR(){
            assertEquals(Boolean.TRUE,obj.isPangramTR(" Açgözlü ve hoşnut, prestije feci bağımlıydık."));
      }
      @Test
      public void test_isPangramTR2(){
            assertEquals(Boolean.FALSE,obj.isPangramTR(" Açgözlü ve hoşnut, prestije"));
      }
      @Test
      public void test_isJavaIdentifier(){
            assertEquals(Boolean.TRUE,obj.isJavaIdentifier("Çağdaş"));
      }
      @Test
      public void test_isJavaIdentifier2(){
            assertEquals(Boolean.FALSE,obj.isJavaIdentifier("190512218"));
      }
      @Test
      public void test_isJavaIdentifier3(){
            assertEquals(Boolean.TRUE,obj.isJavaIdentifier("Muharrem"));
      }
      @Test
      public void test_isJavaIdentifier4(){
            assertEquals(Boolean.FALSE,obj.isJavaIdentifier("190512118"));
      }
    
}