package com.infobelt.aadhaar.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="tbl_todo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Todo{

  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;

  @NonNull
  @Column(name="title" , nullable=false)
  String title;

  @NonNull
  @Column(name="content" , nullable=false)
  String content;

}