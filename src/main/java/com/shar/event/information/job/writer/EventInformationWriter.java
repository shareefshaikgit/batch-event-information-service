package com.shar.event.information.job.writer;

import com.shar.event.information.entity.EventInformation;
import com.shar.event.information.repository.EventInformationRepository;
import lombok.AllArgsConstructor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class EventInformationWriter implements ItemWriter<EventInformation> {

  private final EventInformationRepository eventInformationRepository;

  @Override
  public void write(List<? extends EventInformation> list) throws Exception {
    eventInformationRepository.saveAll(list);
  }
}
