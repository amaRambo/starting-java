import pygame
import sys
import controls
from gun import Gun

def run():

    pygame.init()
    screen = pygame.display.set_mode((700, 500))
    pygame.display.set_caption('Cosmo defenders')
    bg_color = (0,0,0)
    gun = Gun(screen)

    while True:
        controls.events(gun)
        gun.update_gun()
        screen.fill(bg_color)
        gun.output()
        pygame.display.flip()

run()