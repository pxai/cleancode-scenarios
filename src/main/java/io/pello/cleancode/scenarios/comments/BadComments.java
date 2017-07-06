/*
 * Copyright © 2017 Pello Altadill
 * All rights reserved under the copyright laws of the United States and
 * applicable international laws, treaties, and conventions.
 * You may freely redistribute and use this sample code, with or without 
 * modification, provided you include the original copyright notice and 
 * use restrictions.
 * 
 * Disclaimer: THE SAMPLE CODE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL ESRI OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) SUSTAINED BY YOU OR A THIRD PARTY, HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT ARISING IN ANY WAY OUT OF THE USE OF THIS SAMPLE CODE, EVEN IF 
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 * For additional information, contact:
 * Bad Comments Inc.
 * Attn: Contracts and Legal Services Department
 * 221b Baker St, Marylebone
 * London, 92373-8100
 * UK
 * 
 * email: sher@lock.co.uk
*/

/////// PACKAGE DECLARATIONS
package io.pello.cleancode.scenarios.comments;

import java.util.Random;

/////// CLASS ////////////////////

/**
 * BadComments
 * <i>Simple</i> class to show the bad use of comments
 * @version 0.11.0
 *  @author PELLO_ALTADILL
 *  @email sher@lock.co.uk
 *  @since 2010/03/11
* @version 0.10.0
 *  @since 2010/01/15
 *  Same author 
 *  Code improvements to setters
 *  
 * @version 0.0.9
 *  @since 2009/03/11
 *  @author ROBERT C MARTING
 *  @email uncle.bob@cleancoder.com
 * Minor bugfixes  
 *
 * Greetings to my Friends, family and beloved cat
 */
public class BadComments {
	
	//////////// ATTRIBUTES ////////////
	/**
	 * badAttribute
	 */
	private String badAttribute;
	/**
	 * age
	 */
	private int age;
	
	/////////// CONSTRUCTORS ///////////
	
	/**
	 * Default constructor
	 */
	public BadComments () {
		
	}

	/**
	 * Constructor with arguments
	 * @param badAttribute
	 * @param age
	 */
	public BadComments(String badAttribute, int age) {
		this.badAttribute = badAttribute;
		this.age = age;
	}
	
	/////////// METHODS ////////////////

	/**
	 * Increment age
	 */
	public void incrementAge () {
		age++; // We increment age
	}
	
	// Increment age with value when age is odd
	public void incrementAge (int value) {
		if (age % 2 == 0) {
			age += value;
		}
	}
	
	/**
	 * given a length, creates a new password
	 * Throws an exception if an error is found
	 * @param length
	 * @return
	 * @throws Exception
	 */
	public String createPassowrd (int length) throws Exception  {
		// We store result here
		String result = "";
		// We instantiate Random Classs
		Random random = new Random();
		
		// Generate random numbers
		for (int i = 0; i < 10000; i++) {
			// HACK, fix this piece of shit
			result += "" + random.nextInt(10000); 
			if (result.length() > length) {
				break;
			} //if
			
			// Old way to do stuff
			// result += Math.random() + " ";
			// if (result.length()/2 > length) { return result }
			// else { continue; } 
			
		} // for
		
		// phew! it worked
		
		// We return the result
		return result;
	}
	
	public void unclearMethod (String sample) {
		
	}
	
	/////////// GETTERS/SETTERS ///////
	/**
	 * @return the badAttribute
	 */
	public String getBadAttribute() {
		return badAttribute;
	}

	/**
	 * @param badAttribute the badAttribute to set
	 */
	public void setBadAttribute(String badAttribute) {
		this.badAttribute = badAttribute;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
