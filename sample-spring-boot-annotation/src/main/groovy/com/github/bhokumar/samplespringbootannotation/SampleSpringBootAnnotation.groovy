package com.github.bhokumar.samplespringbootannotation

import org.springframework.boot.autoconfigure.AutoConfigurationPackage
import org.springframework.context.annotation.Import

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Inherited
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@AutoConfigurationPackage
@Import(SpringBootAnnotationConfig.class)
@interface SampleSpringBootAnnotation {

}
