 /*
  * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
  *
  * D4L owns all legal rights, title and interest in and to the Software Development Kit ("SDK"),
  * including any intellectual property rights that subsist in the SDK.
  *
  * The SDK and its documentation may be accessed and used for viewing/review purposes only.
  * Any usage of the SDK for other purposes, including usage for the development of
  * applications/third-party applications shall require the conclusion of a license agreement
  * between you and D4L.
  *
  * If you are interested in licensing the SDK for your own applications/third-party
  * applications and/or if you’d like to contribute to the development of the SDK, please
  * contact D4L by email to help@data4life.care.
  */

 package care.data4life.fhir.util;


 import javax.annotation.Nullable;

 /**
  * Utility class for guava style pre-condition checks. Not an official part of the AppAuth API; only
  * intended for internal use and no guarantees are given on source or binary compatibility for this
  * class between versions of AppAuth.
  */
 public final class Preconditions {

     /**
      * Ensures that an object reference passed as a parameter to the calling method is not null.
      *
      * @param reference an object reference
      * @return the non-null reference that was validated
      * @throws NullPointerException if `reference` is `null`
      */
     public static <T> T checkNotNull(T reference) {
         if (reference == null) {
             throw new NullPointerException();
         }
         return reference;
     }

     /**
      * Ensures the truth of an expression involving one or more parameters to the calling method.
      *
      * @param expression a boolean expression
      * @throws IllegalArgumentException if `expression` is `false`
      */
     public static void checkArgument(boolean expression) {
         if (!expression) {
             throw new IllegalArgumentException();
         }
     }

     /**
      * Ensures the truth of an expression involving one or more parameters to the calling method.
      *
      * @param expression   a boolean expression
      * @param errorMessage the exception message to use if the check fails; will be converted to a
      *                     string using {@link String#valueOf(Object)}
      * @throws IllegalArgumentException if `expression` is `false`
      */
     public static void checkArgument(boolean expression, @Nullable Object errorMessage) {
         if (!expression) {
             throw new IllegalArgumentException(String.valueOf(errorMessage));
         }
     }

     private Preconditions() {
         throw new IllegalStateException("This type is not intended to be instantiated");
     }
 }
