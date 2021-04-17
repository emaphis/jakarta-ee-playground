
package org.agoncal.book.service;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 *
 * @author emaph
 */
@Qualifier
@Retention(RUNTIME)
@Target({FIELD, TYPE, PARAMETER, METHOD})
public @interface EightDigits {
}
