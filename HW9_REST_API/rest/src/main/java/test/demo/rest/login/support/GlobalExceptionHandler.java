package test.demo.rest.login.support;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Configuration
@RestControllerAdvice
public class GlobalExceptionHandler {


    /**
     *
     * @param e
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @ExceptionHandler({Exception.class, RuntimeException.class, UserNotFoundException.class})
    public ApiResponse exception(Exception e, HttpServletRequest request,
            HttpServletResponse response) {
        log.warn("系统内部异常, uri:[{}], method: [{}]", request.getRequestURI(), request.getMethod(), e);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setSuccess(false);
        apiResponse.setMessage(e.getMessage());
        return apiResponse;
    }

}
