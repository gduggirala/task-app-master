package com.infobelt.aadhaar.pojo;

import com.infobelt.aadhaar.domain.AbstractEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Task extends AbstractEntity {

  @NonNull
  @Column(name="title" , nullable=false)
  String title;

  @NonNull
  @Column(name="content" , nullable=false)
  String content;

  @NonNull
  @Column(name="isActive" , nullable=false)
  Boolean isActive;

}