package com.xworkz.police.repository;

import com.xworkz.police.entity.PoliceEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public  class PoliceRepositoryImpl implements PoliceRepository {

    @Override
    public void save(List<PoliceEntity> list) {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;

        try {
            factory = Persistence.createEntityManagerFactory("policeUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();
            for (PoliceEntity policeEntity : list) {
                manager.persist(policeEntity);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            if (manager != null) manager.close();
            if (factory != null) factory.close();
        }
    }

    @Override
    public List<PoliceEntity> getAll() {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        List<PoliceEntity> list = new ArrayList<>();

        try {
            factory = Persistence.createEntityManagerFactory("policeUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();
            Query query = manager.createNamedQuery("getAll");
            list = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            if (manager != null) manager.close();
            if (factory != null) factory.close();
        }
        return list;
    }

    @Override
    public List<PoliceEntity> getPoliceEntityByName(String name) {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        List<PoliceEntity> entities = new ArrayList<>();

        try {
            factory = Persistence.createEntityManagerFactory("policeUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();
            Query query = manager.createNamedQuery("getEntityByName");
            query.setParameter("name", name);
            entities = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            if (manager != null) manager.close();
            if (factory != null) factory.close();
        }
        return entities;
    }

    @Override
    public PoliceEntity getPoliceEntityByNameAndPhone(String name, long phone) {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        PoliceEntity policeEntity = null;

        try {
            factory = Persistence.createEntityManagerFactory("policeUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();
            Query query = manager.createNamedQuery("getEntityByNameAndPhone");
            query.setParameter("name", name);
            query.setParameter("phone", phone);
            policeEntity = (PoliceEntity) query.getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            if (manager != null) manager.close();
            if (factory != null) factory.close();
        }
        return policeEntity;
    }

    @Override
    public List<PoliceEntity> getPoliceByAgeAbove25() {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        List<PoliceEntity> policeEntities = null;

        try {
            factory = Persistence.createEntityManagerFactory("policeUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();
            Query query = manager.createNamedQuery("getAgeAbove25");
            policeEntities = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            if (manager != null) manager.close();
            if (factory != null) factory.close();
        }
        return policeEntities;
    }

    @Override
    public List<PoliceEntity> getAgeBetween20And30() {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        List<PoliceEntity> policeEntities = null;

        try {
            factory = Persistence.createEntityManagerFactory("policeUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();
            Query query = manager.createNamedQuery("getAgeBetween20And30");
            policeEntities = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            if (manager != null) manager.close();
            if (factory != null) factory.close();
        }
        return policeEntities;
    }

    @Override
    public PoliceEntity getByEmail(String email) {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        PoliceEntity policeEntity = null;

        try {
            factory = Persistence.createEntityManagerFactory("policeUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();
            Query query = manager.createNamedQuery("getByEmail");
            query.setParameter("email", email);
            policeEntity = (PoliceEntity) query.getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            if (manager != null) manager.close();
            if (factory != null) factory.close();
        }
        return policeEntity;
    }

    @Override
    public PoliceEntity getByPhone(long phone) {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        PoliceEntity policeEntity = null;

        try {
            factory = Persistence.createEntityManagerFactory("policeUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();
            Query query = manager.createNamedQuery("getByPhone");
            query.setParameter("phone", phone);
            policeEntity = (PoliceEntity) query.getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            if (manager != null) manager.close();
            if (factory != null) factory.close();
        }
        return policeEntity;
    }

    @Override
    public String getNameByPlace(String place) {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        String name = null;

        try {
            factory = Persistence.createEntityManagerFactory("policeUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();
            Query query = manager.createNamedQuery("getNameByPlace");
            query.setParameter("placeBy", place);
            name = (String) query.getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            if (manager != null) manager.close();
            if (factory != null) factory.close();
        }
        return name;
    }

    @Override
    public PoliceEntity getNameAndAgeByPhoneNo(long phoneNo) {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        PoliceEntity policeEntity = new PoliceEntity();

        try {
            factory = Persistence.createEntityManagerFactory("policeUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();
            Query query = manager.createNamedQuery("getNameAndAgeByPhoneNo");
            query.setParameter("phoneBy", phoneNo);
            Object[] objects = (Object[]) query.getSingleResult();
            policeEntity.setName((String) objects[0]);
            policeEntity.setAge((int) objects[1]);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            if (manager != null) manager.close();
            if (factory != null) factory.close();
        }
        return policeEntity;
    }

    @Override
    public List<String> getNameByAgeAbove30() {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        List<String> list = new ArrayList<>();

        try {
            factory = Persistence.createEntityManagerFactory("policeUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();
            Query query = manager.createNamedQuery("getNameAbove30");
            list = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            if (manager != null) manager.close();
            if (factory != null) factory.close();
        }
        return list;
    }

    @Override
    public List<PoliceEntity> getNamePlaceEmailByAgeLessThan30() {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        List<PoliceEntity> list = new ArrayList<>();

        try {
            factory = Persistence.createEntityManagerFactory("policeUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();
            Query query = manager.createNamedQuery("getNameAndPlaceAndEmailByAgeLessThan30");
            List<Object[]> objects = query.getResultList();
            for (Object[] o : objects) {
                PoliceEntity entity = new PoliceEntity();
                entity.setName((String) o[0]);
                entity.setPlace((String) o[1]);
                entity.setEmail((String) o[2]);
                list.add(entity);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            if (manager != null) manager.close();
            if (factory != null) factory.close();
        }
        return list;
    }
}
