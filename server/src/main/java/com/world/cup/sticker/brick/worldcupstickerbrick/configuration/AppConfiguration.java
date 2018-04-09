package com.world.cup.sticker.brick.worldcupstickerbrick.configuration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import com.world.cup.sticker.brick.worldcupstickerbrick.repository.entity.Sticker;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.security.core.parameters.P;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class AppConfiguration extends WebMvcConfigurerAdapter {


  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(localeChangeInterceptor());
  }

  @Bean
  public MessageSource messageSource() {
    ReloadableResourceBundleMessageSource messageSource =
        new ReloadableResourceBundleMessageSource();
    messageSource.setBasenames("classpath:/messages/business/message",
        "classpath:/messages/validation/message");

    return messageSource;
  }

  @Bean
  public LocaleResolver localeResolver() {
    SessionLocaleResolver slr = new SessionLocaleResolver();
    slr.setDefaultLocale(Locale.US);
    return slr;
  }

  @Bean
  public LocaleChangeInterceptor localeChangeInterceptor() {
    LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
    lci.setParamName("lang");
    return lci;
  }

  public static void main(String[] args) throws IOException {
    String REGEX = "(\\buruguay\\b|\\btunisia\\b|\\brussia\\b|\\bsaudi arabia\\b|\\begypt\\b|\\buruguay\\b|\\bportugal\\b|\\bspain\\b|\\bmorocco\\b|\\biran\\b|\\bfrance\\b|\\baustralia\\b|\\bperu\\b|\\bdenmark\\b|\\bargentina\\b|\\biceland\\b|\\bcroatia\\b|\\bnigeria\\b|\\bbrazil\\b|\\bswitzerland\\b|\\bcosta rica\\b|\\bserbia\\b|\\bgermany\\b|\\bmexico\\b|\\bsweden\\b|\\bkorea republic\\b|\\bbelgium\\b|\\bpanama\\b|\\btunisia\\b|\\bengland\\b|\\bpoland\\b|\\bsenegal\\b|\\bcolombia\\b|\\bjapan\\b|\\blegends\\b|\\bespecial\\b|\\bstadiums\\b|\\bcities\\b) ([0-9]+) ([0-9a-zA-z -]+)";
    Pattern pattern = Pattern.compile(REGEX);

    Path path = Paths.get("stickers-code.txt");
    Stream<String> lines = Files.lines(path);

    List<Sticker> collect = new ArrayList<>();

    lines.forEach(line -> {
      Matcher matcher = pattern.matcher(line);
      if (matcher.matches()) {
        collect.add(new Sticker(Integer.parseInt(matcher.group(2)), matcher.group(3), matcher.group(1)));
      } else {
        System.out.println(line);
      }

    });

    System.out.println(collect);
  }

}
