����   4 /  4com/sut62/team01/sut62team01/entity/BorrowedBikeType  java/lang/Object id J RuntimeVisibleAnnotations Ljavax/persistence/Id; %Ljavax/persistence/SequenceGenerator; name borrowedBikeType_seq sequenceName "Ljavax/persistence/GeneratedValue; strategy "Ljavax/persistence/GenerationType; SEQUENCE 	generator Ljavax/persistence/Column; BORROWED_BIKE_TYPE_ID &Ljavax/validation/constraints/NotNull; RuntimeVisibleTypeAnnotations type Ljava/lang/String; borrowedBikes Ljava/util/Collection; 	Signature JLjava/util/Collection<Lcom/sut62/team01/sut62team01/entity/BorrowedBike;>; Ljavax/persistence/OneToMany; fetch Ljavax/persistence/FetchType; EAGER <init> ()V Code
  $   ! LineNumberTable LocalVariableTable this 6Lcom/sut62/team01/sut62team01/entity/BorrowedBikeType; (Ljava/lang/String;)V	  +   
SourceFile BorrowedBikeType.java Ljavax/persistence/Entity; !             1     	  
s  s    e   s    
s                                                   e       !  "   3     *� #�    %   
       &        ' (      )  "   F     
*� #*+� *�    %           	 ! &       
 ' (     
     ,    -      .  