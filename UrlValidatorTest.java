/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import junit.framework.TestCase;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   private void report(int i, int j){
	   if(i<j){
		   System.out.printf("Test %d Failed \n", j);
	   }
   }
   
   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   int count = 0;
	   int testcount = 0; 
			   
	   if(urlVal.isValid("http://www.amazon.com")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(urlVal.isValid("https://www.amazon.com")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(urlVal.isValid("ftp://www.amazon.com")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(urlVal.isValid("h3t://www.amazon.com")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(!urlVal.isValid("http:/www.amazon.com")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(!urlVal.isValid("http://www.amazon")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(!urlVal.isValid("http://www.amazon:85")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(!urlVal.isValid("http://www.amazon.com:a")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(!urlVal.isValid("http://www.amazon.com:86v")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(urlVal.isValid("http://www.amazon.com:55")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(urlVal.isValid("http://amazon.com")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(urlVal.isValid("http://ww.amazon.com")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(!urlVal.isValid("http://www.amazon_.com")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(!urlVal.isValid("http//www.amazon.com")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(!urlVal.isValid("http:/www.amazon.com")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(!urlVal.isValid("http://256.256.256.256:80")){
		   count++;
	   }
	   testcount++;
	   if(!urlVal.isValid("http://1.2.3.4.5:80")){
		   count++;
	   }
	   testcount++;
	   report(count,testcount);
	   if(urlVal.isValid("http://255.255.255.255:80")){
		   count++;
	   }
	   testcount++;
	  
	   
	   System.out.printf("Tests Passed: %d     Tests Failed: %d", count, testcount-count);	   
	   
   }
   
   
   public void testYourFirstPartition()
   {
	   
   }
   
   public void testYourSecondPartition(){
	   
   }
   
   
   public void testIsValid()
   {
	   for(int i = 0;i<10000;i++)
	   {
		   
	   }
   }
   
   public void testAnyOtherUnitTest()
   {
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

}
