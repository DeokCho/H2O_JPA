package com.h2odb.web.hospital;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name="hospital", uniqueConstraints={@UniqueConstraint(columnNames = {"hospital_name"})})
public class Hospital {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="hospital_id") private String id;
    @Column(name="hospital_name") private String hospitalName;
    @Column(name = "logo", nullable = false) private String logo;
    @Column(name = "addr", nullable = false) private String addr;
    @Column(name = "hospital_type", nullable = false) private String hospitalType;
    @Column(name = "medical_person", nullable = false) private String medical_person;
    @Column(name = "tel", nullable = false) private String tel;
    @Column(name = "latitude", nullable = false) private String latitude;
    @Column(name = "longitude", nullable = false) private String longitude;




/*    PK병원이름, 로고, 주소, 병원분류(개인/대학), 의사선생님, 병원전화번호, 위도, 경도
        Hospital_name, Logo, Addr, Hospital_type, Medical_person, Tel, Latitude, Longtitude
        - 병원이름으로 '게시판'과 연결  (병원 '1' : '다' 게시판)
        - 병원이름으로 '의사'와 연결 (병원 '1' : '다' 의사)*/
}