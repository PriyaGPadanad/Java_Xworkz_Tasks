package com.xworkz.hospital.runner;

import com.xworkz.hospital.entity.DoctorEntity;
import com.xworkz.hospital.entity.HospitalEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class HospitalRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF= Persistence.createEntityManagerFactory("Xworkz");
        EntityManager eM=eMF.createEntityManager();
        EntityTransaction eT=eM.getTransaction();
        eT.begin();

        List<DoctorEntity>doctorEntities=new ArrayList<>();
        doctorEntities.add(new DoctorEntity(1, "Dr. Anika Sharma", "Ophthalmology", "VisionCare Hospital", "anika.sharma@visioncare.com", 9876543210L));
        doctorEntities.add(new DoctorEntity(2, "Dr. Rajiv Menon", "Cardiology", "PulseHeart Institute", "rajiv.menon@pulseheart.org", 9123456789L));
        doctorEntities.add(new DoctorEntity(3, "Dr. Meera Nair", "Pediatrics", "BrightLife Clinic", "meera.nair@brightlife.in", 9988776655L));
        doctorEntities.add(new DoctorEntity(4, "Dr. Omar Qureshi", "Orthopedics", "Healing Touch Center", "omar.qureshi@healingtouch.com", 9001122334L));
        doctorEntities.add(new DoctorEntity(5, "Dr. Nandita Joshi", "Dermatology", "DermaGlow Hospital", "nandita.joshi@dermaglow.com", 9345678901L));
        doctorEntities.add(new DoctorEntity(6, "Dr. Vikram Sinha", "Neurology", "NeuroWell Clinic", "vikram.sinha@neurowell.com", 9765432109L));
        doctorEntities.add(new DoctorEntity(7, "Dr. Rhea Kapoor", "Gynecology", "BloomCare Hospital", "rhea.kapoor@bloomcare.in", 9876012345L));
        doctorEntities.add(new DoctorEntity(8, "Dr. Aditya Verma", "ENT", "EarNoseThroat Center", "aditya.verma@entcenter.org", 9456123780L));
        doctorEntities.add(new DoctorEntity(9, "Dr. Fatima Khan", "Psychiatry", "MindBalance Clinic", "fatima.khan@mindbalance.com", 9012345678L));
        doctorEntities.add(new DoctorEntity(10, "Dr. Arjun Patel", "General Medicine", "CareFirst Hospital", "arjun.patel@carefirst.com", 9367182930L));

        for(DoctorEntity doctorEntity:doctorEntities) {
            eM.persist(doctorEntity);
        }

        DoctorEntity doctorEntity=eM.find(DoctorEntity.class,1);

        List<HospitalEntity> hospitalEntities = new ArrayList<>();

        hospitalEntities.add(new HospitalEntity(1, "EyeMax Hospital", "Mumbai", "Eye", 150, 9876543210L));
        hospitalEntities.add(new HospitalEntity(2, "HeartCare Center", "Delhi", "Cardiology", 200, 9823456789L));
        hospitalEntities.add(new HospitalEntity(3, "NeuroLife Hospital", "Bangalore", "Neurology", 120, 9811122233L));
        hospitalEntities.add(new HospitalEntity(4, "OrthoPlus Clinic", "Chennai", "Orthopedic", 80, 9834567890L));
        hospitalEntities.add(new HospitalEntity(5, "Smile Dental Hub", "Hyderabad", "Dental", 60, 9845678901L));
        hospitalEntities.add(new HospitalEntity(6, "Sunrise Children's Hospital", "Kolkata", "Pediatrics", 100, 9856789012L));
        hospitalEntities.add(new HospitalEntity(7, "General Care Hospital", "Ahmedabad", "General", 250, 9867890123L));
        hospitalEntities.add(new HospitalEntity(8, "SkinSure Dermatology Center", "Pune", "Dermatology", 70, 9878901234L));
        hospitalEntities.add(new HospitalEntity(9, "PathVision Labs", "Jaipur", "Pathology", 50, 9889012345L));
        hospitalEntities.add(new HospitalEntity(10, "OncoHope Hospital", "Lucknow", "Oncology", 130, 9890123456L));

        for(HospitalEntity hospitalEntity:hospitalEntities){
            eM.persist(hospitalEntity);
        }

        HospitalEntity hospitalEntity=eM.find(HospitalEntity.class,1);

        eT.commit();
        eM.close();
    }
}
