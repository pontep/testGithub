����   4 E  *com/sut62/team01/sut62team01/entity/Repair  java/lang/Object id Ljava/lang/Long; RuntimeVisibleAnnotations Ljavax/persistence/Id; %Ljavax/persistence/SequenceGenerator; name 
REPAIR_seq sequenceName "Ljavax/persistence/GeneratedValue; strategy "Ljavax/persistence/GenerationType; SEQUENCE 	generator Ljavax/persistence/Column; 
SREPAIR_ID unique    nullable manner Ljava/lang/String; MANNER 
repairDate Ljava/util/Date; Repair_Date type 0Lcom/sut62/team01/sut62team01/entity/DeviceType; Ljavax/persistence/ManyToOne; fetch Ljavax/persistence/FetchType; EAGER targetEntity Ljavax/persistence/JoinColumn; DEVICETYPE_ID 
insertable room LRoom; ROOM_ID studentNotify 	LStudent; 
STUDENT_ID <init> ()V Code 1 java/lang/Error 3 �Unresolved compilation problems: 
	Room cannot be resolved to a type
	Room cannot be resolved to a type
	Student cannot be resolved to a type
	Student cannot be resolved to a type

 0 5 - 6 (Ljava/lang/String;)V LineNumberTable LocalVariableTable this ,Lcom/sut62/team01/sut62team01/entity/Repair; 
SourceFile Repair.java Ljavax/persistence/Entity; Ljavax/persistence/Table; REPAIR A Room C Student MissingTypes !             7     	  
s  s    e   s    
s  Z  Z             
s             
s               e ! " #c  $  
s % &Z   ' (           e ! " #c ( $  
s ) &Z   * +           e ! " #c + $  
s , &Z    - .  /   4     
� 0Y2� 4�    7       ' 8       
 9 :    ;    <      =   >  
s ? D     @ B