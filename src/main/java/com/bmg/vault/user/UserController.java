package com.bmg.vault.user;

import com.bmg.vault.user.group.UserGroup;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Operation(summary = "Get a book by its id")
    public Iterable<UserGroup> getUserGroups(){
        return null;
    }
}
