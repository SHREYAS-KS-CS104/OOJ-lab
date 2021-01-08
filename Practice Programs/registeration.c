#include<stdio.h>
#include<string.h>
int iot;
int advanced_java;
int advanced_data; typedef struct student {
char name[50]; char course[50];
}std;
int main() {
char elective1[50]="Internet Of Things";
char elective2[50]="Advanced Java And J2EEE";
char elective3[50]="Advanced DataStructures";
printf("Courses available are \n \t 1:Internet Of Things\n \t2:Advanced Java And J2EEE\n \t3:Advanced DataStructures\n");
int n;
int choice;
printf("Enter the number of students\n"); scanf(" %d",&n);
std s[n];
for(int i=0;i<n;i++)
{
printf("Enter the name of student %d \n",(i+1)); scanf(" %s", s[i].name);
fflush(stdin);
printf("Enter the elective of student %d \n",(i+1)); printf("enter your choice\n");
fflush(stdin);
scanf(" %d",&choice); switch(choice)
{
case 1:
strcpy(s[i].course,elective1); break;
case 2: strcpy(s[i].course,elective2); break;
case 3: strcpy(s[i].course,elective3);

break; }
fflush(stdin); }
for(int i=0;i<n;i++) {
if(strncmp(elective1,s[i].course,strlen(elective1))==0) {
printf("Student %s has selected for %s course\n",s[i].name,s[i].course);
iot++; }
if(strncmp(elective2,s[i].course,strlen(elective2))==0) {
printf("Student %s has selected for %s course\n",s[i].name,s[i].course);
advanced_java++; }
if(strncmp(elective3,s[i].course,strlen(elective3))==0) {
printf("Student %s has selected for %s course\n",s[i].name,s[i].course);
advanced_data++; }
}
printf("***************************************\n");
printf("Number of student applied for internet of things is %d\n",iot);
printf("Number of students applied for Advanced java and J2EEE is %d\n",advanced_java); 
printf("Number of student applied for Advanced DataStructures is %d\n",advanced_data); 
if(iot<30)
{
for(int i=0;i<n;i++)

{
if(strncmp(s[i].course,elective1,strlen(elective1))==0) {
printf(" %s please select from the other two course this course cannot be floated\n",s[i].name);
printf("2:Advanced Java And J2EEE\n3:Advanced DataStructures\n"); printf("Enter your new choice\n");
scanf(" %d",&choice);
iot=0;
switch(choice) {
case 2: strcpy(s[i].course,elective2); advanced_java++;
break;
case 3: strcpy(s[i].course,elective3); advanced_data++;
break;
}
} }
} if(advanced_java<30) {
for(int i=0;i<n;i++) {
if(strncmp(s[i].course,elective2,strlen(elective2))==0) {

printf(" %s please select from the other two course this course cannot be floated\n",s[i].name);
printf("1:Internet Of Things\n3:Advanced DataStructures\n"); printf("Enter your new choice\n");
scanf(" %d",&choice);
advanced_java=0;
switch(choice) {
case 1: strcpy(s[i].course,elective1); iot++;
break;
case 3: strcpy(s[i].course,elective3); advanced_data++;
break;
}
} }
}
if(advanced_data<30) {
for(int i=0;i<n;i++) {
if(strncmp(s[i].course,elective3,strlen(elective3))==0) {
printf(" %s please select from the other two course this course cannot be floated\n",s[i].name);
printf("1:Internet Of Things\n2:Advanced JAVA and J2EEE\n");

printf("Enter your new choice\n"); scanf(" %d",&choice); advanced_data=0;
switch(choice)
{
case 1:
strcpy(s[i].course,elective1); iot++;
break;
case 2: strcpy(s[i].course,elective2); advanced_java++;
break;
}
} 
}
}
printf("************AfterReselection**************\n");
printf("Number of student applied for internet of things is %d\n",iot);
printf("Number of student applied for Advanced Java and J2EEE is %d\n",advanced_java);
printf("Number of student applied for Advanced Datastructures is %d\n",advanced _data);
printf("***************************************************\n");
for(int i=0;i<n;i++)
{
printf("%s has selected %s course\n",s[i].name,s[i].course); 
}
}