package io.beaniejoy.dongnecafe.domain.cafe.error

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class CafeExceptionHandler {
    @ExceptionHandler(CafeNotFoundException::class)
    fun handleNotFound(exception: CafeNotFoundException): ResponseEntity<String> {
        return ResponseEntity.badRequest().body(exception.message)
    }
}