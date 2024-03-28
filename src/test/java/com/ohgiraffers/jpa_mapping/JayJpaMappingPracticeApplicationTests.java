package com.ohgiraffers.jpa_mapping;

import com.ohgiraffers.jpa_mapping.section01.RepairRegistService;
import com.ohgiraffers.jpa_mapping.section01.RepairRequestDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
class JayJpaMappingPracticeApplicationTests {

    @Autowired
    private RepairRegistService repairRegistService;

 private static Stream<Arguments> getRepairRequest() {
     return Stream.of(
             Arguments.of(
                     1,
                     "iPhone 12 Pro Max",
                     "고스팅 현상이 주기적으로 발생함",
                     310000,
                     "N"
             ),
             Arguments.of(
                     2,
                     "iPhone 13",
                     "전면부 액정 파손",
                     125000,
                     "Y"
             ),
             Arguments.of(
                     3,
                     "iPhone 15 Pro",
                     "배터리 불량",
                     50000,
                     "Y"
             )
     );
 }

 @DisplayName("테이블 생성 테스트")
 @ParameterizedTest
 @MethodSource("getRepairRequest")
 void testCreateTable(int requestNo, String model, String issue, int repairCost, String insurance) {
     // given
     RepairRequestDTO repairRequest = new RepairRequestDTO(
             requestNo,
             model,
             issue,
             repairCost,
             insurance
     );
     // when

     // then
     Assertions.assertDoesNotThrow(
             () -> repairRegistService.registRequest(repairRequest)
     );
 }

}
