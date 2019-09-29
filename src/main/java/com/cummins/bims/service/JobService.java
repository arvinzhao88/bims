package com.cummins.bims.service;

import com.cummins.bims.dto.Issue;
import com.cummins.bims.dto.IssueJobReview;
import com.cummins.permission.model.BimsPerson;

import java.util.List;

public interface JobService {
    Integer add(IssueJobReview issueJobReview,BimsPerson person);

    List<IssueJobReview> getReviewList(String issueId);

    IssueJobReview getReview(String issueId);

    Integer job1Close(IssueJobReview issueJobReview, BimsPerson person);

    Integer job1Reject(IssueJobReview issueJobReview, BimsPerson person);

    List<Issue> selectBySo(Issue issue);

    Integer apuAdd(Issue issue,BimsPerson person);
}
