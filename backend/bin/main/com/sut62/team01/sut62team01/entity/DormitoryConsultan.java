����   4 3  6com/sut62/team01/sut62team01/entity/DormitoryConsultan  java/lang/Object id J RuntimeVisibleAnnotations Ljavax/persistence/Id; %Ljavax/persistence/SequenceGenerator; name dorm_seq sequenceName "Ljavax/persistence/GeneratedValue; strategy "Ljavax/persistence/GenerationType; SEQUENCE 	generator Ljavax/persistence/Column; DORM_ID &Ljavax/validation/constraints/NotNull; RuntimeVisibleTypeAnnotations Ljava/lang/String; username password borrowedBikes Ljava/util/Collection; 	Signature JLjava/util/Collection<Lcom/sut62/team01/sut62team01/entity/BorrowedBike;>; Ljavax/persistence/OneToMany; fetch Ljavax/persistence/FetchType; EAGER <init> ()V Code
  % ! " LineNumberTable LocalVariableTable this 8Lcom/sut62/team01/sut62team01/entity/DormitoryConsultan; 9(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V	  , 
 	  .  	  0   
SourceFile DormitoryConsultan.java !             1     	  
s  s    e   s    
s               
                              e      ! "  #   3     *� $�    &   
       '        ( )    ! *  #   l     *� $*+� +*,� -*-� /�    &           	 !  "  # '   *     ( )      
                1    2