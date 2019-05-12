package com.example.test.bean;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class TestBean {
    @NonNull private String content;
    private String name;
}
