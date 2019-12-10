����   4 1  0com/sut62/team01/sut62team01/entity/BorrowedBike  java/lang/Object id J RuntimeVisibleAnnotations Ljavax/persistence/Id; %Ljavax/persistence/SequenceGenerator; name borrowedBike_seq sequenceName "Ljavax/persistence/GeneratedValue; strategy "Ljavax/persistence/GenerationType; SEQUENCE 	generator Ljavax/persistence/Column; BORROWED_BIKE_ID &Ljavax/validation/constraints/NotNull; RuntimeVisibleTypeAnnotations dormitoryConsultan 8Lcom/sut62/team01/sut62team01/entity/DormitoryConsultan; Ljavax/persistence/ManyToOne; fetch Ljavax/persistence/FetchType; EAGER targetEntity Ljavax/persistence/JoinColumn; DORM_ID 
insertable    7Lcom/fasterxml/jackson/annotation/JsonManagedReference; borrowedBikeType 6Lcom/sut62/team01/sut62team01/entity/BorrowedBikeType; BORROWED_BIKE_TYPE_ID <init> ()V Code
  ) % & LineNumberTable LocalVariableTable this 2Lcom/sut62/team01/sut62team01/entity/BorrowedBike; 
SourceFile BorrowedBike.java Ljavax/persistence/Entity; !             1     	  
s  s    e   s    
s                     (    e   c    
s  Z   !                " #     (    e   c #   
s $ Z   !                 % &  '   /     *� (�    *        +        , -    .    /      0  