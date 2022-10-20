package com.emily.server;

import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

@Service
public class FlashCardService {

    private final FlashCardRepo repo;

    public FlashCardService(FlashCardRepo repo) {
        this.repo = repo;
    }

    public List<FlashCardEntity> findAll() {
        return repo.findAll();
    }

    public FlashCardEntity addOne(FlashCardDTO dto) {
        FlashCardEntity fc = new FlashCardEntity();

        fc.setBack(dto.getBack());
        fc.setFront(dto.getFront());
        fc.setLastTimeCorrect(false);
        fc.setTotalViews(0);
        fc.setTimesCorrect(0);
        return repo.save(fc);
    }

    public FlashCardEntity patchByFront(String front , Map<String, String> fc) {
        FlashCardEntity target = repo.findByFront(front).orElseThrow(()-> new NoSuchElementException("cannot find element"));
        fc.forEach((k,v)->{
            Field field = ReflectionUtils.findField(FlashCardEntity.class, k);
            if (!Objects.isNull(field)){
                String fieldName = field.getName();
                String methodName = ("set"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1));

                try{
                    ReflectionUtils.invokeMethod(target.getClass().getMethod(methodName, String.class),target, v);
                }catch(NoSuchMethodException e){
                    System.out.println("hi");
                }
            }
    });
    return repo.save(target);
    }

    public FlashCardEntity getByFront(String front) {

        return repo.findByFront(front).orElseThrow(()->new NoSuchElementException("cannot find element"));
    }
}
