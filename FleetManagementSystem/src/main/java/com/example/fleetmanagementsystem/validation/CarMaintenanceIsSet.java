package com.example.fleetmanagementsystem.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = CarMaintenanceIsSetValidator.class)
@Documented
public @interface CarMaintenanceIsSet {
    String message() default "Number of km or set date should not be null.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}