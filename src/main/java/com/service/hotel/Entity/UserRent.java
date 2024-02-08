package com.service.hotel.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "user_rent")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @Column(name = "start_rent_date", nullable = false)
    private LocalDate startRentDate;

    @Column(name = "end_rent_date", nullable = false)
    private LocalDate endRentDate;


}
