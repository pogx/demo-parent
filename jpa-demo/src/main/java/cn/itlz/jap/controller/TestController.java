package cn.itlz.jap.controller;

import cn.itlz.jap.dto.response.UserDto;
import cn.itlz.jap.entity.Course;
import cn.itlz.jap.entity.User;
import cn.itlz.jap.repository.jpa.CourseRepository;
import cn.itlz.jap.repository.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liuzd QQ: 77822013 2019/4/4 0004
 */
@RestController
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("user")
    public User getUser() {
        User u = userRepository.getOne(1L);

        UserDto userDto = new UserDto();
        userDto.setId(u.getId());
        userDto.setName(u.getName());
        return u;
    }

    @GetMapping("course")
    public Course getCourse() {
        Course course = courseRepository.getOne(1L);
        return course;
    }

    @GetMapping("user1")
    public UserDto getUserDto() {
//        return userRepository.getUserDto();
        return null;
    }
}
