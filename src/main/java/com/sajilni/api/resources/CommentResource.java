package com.sajilni.api.resources;

import com.sajilni.api.entites.Comment;
import com.sajilni.api.service.CommentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/messages/{messageId}/comments")
public class CommentResource {
    CommentService commentService = new CommentService();

    @GetMapping
    public List<Comment> test(@PathVariable("messageId") long messageId) {
        return commentService.getAllComments(messageId);
    }

    @GetMapping("/{commentId}")
    public Comment getComment(@PathVariable("messageId") long messageId, @PathVariable("commentId") long commentId) {
        return commentService.getComment(messageId, commentId);
    }

    @PostMapping
    public Comment addComment(@PathVariable("messageId") long messageId, @RequestBody Comment comment) {
        return commentService.addComment(messageId, comment);
    }

    @PutMapping("/{commentId}")
    public Comment updateComment(@PathVariable("messageId") long messageId,@PathVariable("commentId") long commentId, @RequestBody Comment comment) {
        comment.setId(commentId);
        return commentService.updateComment(messageId, comment);
    }

    @DeleteMapping("/{commentId}")
    public void removeComment(@PathVariable("messageId") long messageId, @PathVariable("commentId") long commentId) {
        commentService.removeComment(messageId, commentId);
    }
}
