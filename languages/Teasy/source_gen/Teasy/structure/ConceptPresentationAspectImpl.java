package Teasy.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Action;
  private ConceptPresentation props_ActionItemList;
  private ConceptPresentation props_ActionListToImplement;
  private ConceptPresentation props_ActionListToReferences;
  private ConceptPresentation props_ActiveActionElement;
  private ConceptPresentation props_Actor;
  private ConceptPresentation props_ActorItemList;
  private ConceptPresentation props_ActorListToImplement;
  private ConceptPresentation props_ActorListToReferences;
  private ConceptPresentation props_BlockAction;
  private ConceptPresentation props_BlockActionItemList;
  private ConceptPresentation props_BlockActionListToImplement;
  private ConceptPresentation props_BlockActionListToReferences;
  private ConceptPresentation props_ClickElement;
  private ConceptPresentation props_Component;
  private ConceptPresentation props_Components;
  private ConceptPresentation props_Configuration;
  private ConceptPresentation props_ConfigurationOld;
  private ConceptPresentation props_DataForAction;
  private ConceptPresentation props_DefaultElement;
  private ConceptPresentation props_ElementToReceiveData;
  private ConceptPresentation props_ElementToReceiveDataItemList;
  private ConceptPresentation props_ElementToReceiveDataListToImplement;
  private ConceptPresentation props_ElementToReceiveDataListToReferences;
  private ConceptPresentation props_ExecuteJavascript;
  private ConceptPresentation props_Flow;
  private ConceptPresentation props_FlowListToImplement;
  private ConceptPresentation props_InputText;
  private ConceptPresentation props_InvalidData;
  private ConceptPresentation props_Keyword;
  private ConceptPresentation props_Keywords;
  private ConceptPresentation props_Page;
  private ConceptPresentation props_PageListToImplement;
  private ConceptPresentation props_PageShouldContain;
  private ConceptPresentation props_PageShouldContainElement;
  private ConceptPresentation props_PageShouldNotContain;
  private ConceptPresentation props_PageShouldNotContainElement;
  private ConceptPresentation props_Step;
  private ConceptPresentation props_ValidData;
  private ConceptPresentation props_VerifierElement;
  private ConceptPresentation props_VerifierElementItemList;
  private ConceptPresentation props_VerifierElementListToImplement;
  private ConceptPresentation props_VerifierElementListToReferences;
  private ConceptPresentation props_WaitForCondition;
  private ConceptPresentation props_WaitUntilElementIsEnabled;
  private ConceptPresentation props_WaitUntilElementIsNotVisible;
  private ConceptPresentation props_WaitUntilElementIsVisible;
  private ConceptPresentation props_WaitUntilPageContains;
  private ConceptPresentation props_WaitUntilPageContainsElement;
  private ConceptPresentation props_WaitUntilPageDoesNotContain;
  private ConceptPresentation props_WaitUntilPageDoesNotContainElement;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Action:
        if (props_Action == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This file dispatcher a action in system");
          cpb.presentationByName();
          props_Action = cpb.create();
        }
        return props_Action;
      case LanguageConceptSwitch.ActionItemList:
        if (props_ActionItemList == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Action item to insert in action list with references for Action");
          cpb.rawPresentation("Action Item List");
          props_ActionItemList = cpb.create();
        }
        return props_ActionItemList;
      case LanguageConceptSwitch.ActionListToImplement:
        if (props_ActionListToImplement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("List of the actions using action item");
          cpb.rawPresentation("Action List");
          props_ActionListToImplement = cpb.create();
        }
        return props_ActionListToImplement;
      case LanguageConceptSwitch.ActionListToReferences:
        if (props_ActionListToReferences == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Action List to References the ActionListToImplement");
          cpb.rawPresentation("Action List to References");
          props_ActionListToReferences = cpb.create();
        }
        return props_ActionListToReferences;
      case LanguageConceptSwitch.ActiveActionElement:
        if (props_ActiveActionElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This file represents a element for active a action");
          cpb.presentationByName();
          props_ActiveActionElement = cpb.create();
        }
        return props_ActiveActionElement;
      case LanguageConceptSwitch.Actor:
        if (props_Actor == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This class represents of the actor in system");
          cpb.presentationByName();
          props_Actor = cpb.create();
        }
        return props_Actor;
      case LanguageConceptSwitch.ActorItemList:
        if (props_ActorItemList == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This class represents of the actor references in system");
          cpb.presentationByName();
          props_ActorItemList = cpb.create();
        }
        return props_ActorItemList;
      case LanguageConceptSwitch.ActorListToImplement:
        if (props_ActorListToImplement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept contains a Actor list for use the system");
          cpb.rawPresentation("Actor List");
          props_ActorListToImplement = cpb.create();
        }
        return props_ActorListToImplement;
      case LanguageConceptSwitch.ActorListToReferences:
        if (props_ActorListToReferences == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept contains a Actor items refences for use the system");
          cpb.rawPresentation("Actor List to References");
          props_ActorListToReferences = cpb.create();
        }
        return props_ActorListToReferences;
      case LanguageConceptSwitch.BlockAction:
        if (props_BlockAction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This file contains actions to execute in sequence mode");
          cpb.presentationByName();
          props_BlockAction = cpb.create();
        }
        return props_BlockAction;
      case LanguageConceptSwitch.BlockActionItemList:
        if (props_BlockActionItemList == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Item of the Block Action for References");
          cpb.rawPresentation("Item of the Block Action");
          props_BlockActionItemList = cpb.create();
        }
        return props_BlockActionItemList;
      case LanguageConceptSwitch.BlockActionListToImplement:
        if (props_BlockActionListToImplement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("List to register block actions");
          cpb.rawPresentation("Block Action List");
          props_BlockActionListToImplement = cpb.create();
        }
        return props_BlockActionListToImplement;
      case LanguageConceptSwitch.BlockActionListToReferences:
        if (props_BlockActionListToReferences == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("List of the Block Actions for references");
          cpb.rawPresentation("Block Action List to References");
          props_BlockActionListToReferences = cpb.create();
        }
        return props_BlockActionListToReferences;
      case LanguageConceptSwitch.ClickElement:
        if (props_ClickElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Concept to represents a Click Element in generation step.");
          cpb.rawPresentation("Click Element");
          props_ClickElement = cpb.create();
        }
        return props_ClickElement;
      case LanguageConceptSwitch.Component:
        if (props_Component == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This artefact represents a component for webpage");
          cpb.presentationByName();
          props_Component = cpb.create();
        }
        return props_Component;
      case LanguageConceptSwitch.Components:
        if (props_Components == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("All components of the system are registered here.");
          cpb.rawPresentation("Components");
          props_Components = cpb.create();
        }
        return props_Components;
      case LanguageConceptSwitch.Configuration:
        if (props_Configuration == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Configuration for running tests");
          cpb.rawPresentation("Configuration");
          props_Configuration = cpb.create();
        }
        return props_Configuration;
      case LanguageConceptSwitch.ConfigurationOld:
        if (props_ConfigurationOld == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This file is for configuration test");
          cpb.rawPresentation("Configuration");
          props_ConfigurationOld = cpb.create();
        }
        return props_ConfigurationOld;
      case LanguageConceptSwitch.DataForAction:
        if (props_DataForAction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept represents data for use in action");
          cpb.rawPresentation("Data For Action");
          props_DataForAction = cpb.create();
        }
        return props_DataForAction;
      case LanguageConceptSwitch.DefaultElement:
        if (props_DefaultElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This is a element father");
          cpb.presentationByName();
          props_DefaultElement = cpb.create();
        }
        return props_DefaultElement;
      case LanguageConceptSwitch.ElementToReceiveData:
        if (props_ElementToReceiveData == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept represents for ");
          cpb.presentationByName();
          props_ElementToReceiveData = cpb.create();
        }
        return props_ElementToReceiveData;
      case LanguageConceptSwitch.ElementToReceiveDataItemList:
        if (props_ElementToReceiveDataItemList == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("For use in list elements receive data list");
          cpb.rawPresentation("Element to receive data item list");
          props_ElementToReceiveDataItemList = cpb.create();
        }
        return props_ElementToReceiveDataItemList;
      case LanguageConceptSwitch.ElementToReceiveDataListToImplement:
        if (props_ElementToReceiveDataListToImplement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("List of the receive data elements");
          cpb.rawPresentation("Element to Receive Data List");
          props_ElementToReceiveDataListToImplement = cpb.create();
        }
        return props_ElementToReceiveDataListToImplement;
      case LanguageConceptSwitch.ElementToReceiveDataListToReferences:
        if (props_ElementToReceiveDataListToReferences == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("for use in others archives to references");
          cpb.rawPresentation("Element to receive data list references");
          props_ElementToReceiveDataListToReferences = cpb.create();
        }
        return props_ElementToReceiveDataListToReferences;
      case LanguageConceptSwitch.ExecuteJavascript:
        if (props_ExecuteJavascript == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Execute JavaScript");
          props_ExecuteJavascript = cpb.create();
        }
        return props_ExecuteJavascript;
      case LanguageConceptSwitch.Flow:
        if (props_Flow == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This file represents a flow for generate tests using the system described");
          cpb.presentationByName();
          props_Flow = cpb.create();
        }
        return props_Flow;
      case LanguageConceptSwitch.FlowListToImplement:
        if (props_FlowListToImplement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("List of the flows to execute");
          cpb.rawPresentation("Flow List");
          props_FlowListToImplement = cpb.create();
        }
        return props_FlowListToImplement;
      case LanguageConceptSwitch.InputText:
        if (props_InputText == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Concept to represents a Input text in generation step.");
          cpb.rawPresentation("Input Text");
          props_InputText = cpb.create();
        }
        return props_InputText;
      case LanguageConceptSwitch.InvalidData:
        if (props_InvalidData == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept represents invalid data for use in data for action file");
          cpb.rawPresentation("Invalid data");
          props_InvalidData = cpb.create();
        }
        return props_InvalidData;
      case LanguageConceptSwitch.Keyword:
        if (props_Keyword == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Set of Step for represent a action in system.");
          cpb.presentationByName();
          props_Keyword = cpb.create();
        }
        return props_Keyword;
      case LanguageConceptSwitch.Keywords:
        if (props_Keywords == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Set of Keywords for use in flows ");
          cpb.presentationByName();
          props_Keywords = cpb.create();
        }
        return props_Keywords;
      case LanguageConceptSwitch.Page:
        if (props_Page == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This file represents a system page file");
          cpb.presentationByName();
          props_Page = cpb.create();
        }
        return props_Page;
      case LanguageConceptSwitch.PageListToImplement:
        if (props_PageListToImplement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Represents a set pages in the system");
          cpb.rawPresentation("Page List");
          props_PageListToImplement = cpb.create();
        }
        return props_PageListToImplement;
      case LanguageConceptSwitch.PageShouldContain:
        if (props_PageShouldContain == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Page Should Contain");
          props_PageShouldContain = cpb.create();
        }
        return props_PageShouldContain;
      case LanguageConceptSwitch.PageShouldContainElement:
        if (props_PageShouldContainElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Page Should Contain Element");
          props_PageShouldContainElement = cpb.create();
        }
        return props_PageShouldContainElement;
      case LanguageConceptSwitch.PageShouldNotContain:
        if (props_PageShouldNotContain == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Page Should Not Contain");
          props_PageShouldNotContain = cpb.create();
        }
        return props_PageShouldNotContain;
      case LanguageConceptSwitch.PageShouldNotContainElement:
        if (props_PageShouldNotContainElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Page Should Not Contain Element");
          props_PageShouldNotContainElement = cpb.create();
        }
        return props_PageShouldNotContainElement;
      case LanguageConceptSwitch.Step:
        if (props_Step == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("A Unique Step for use in actions");
          props_Step = cpb.create();
        }
        return props_Step;
      case LanguageConceptSwitch.ValidData:
        if (props_ValidData == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("For insert valid data");
          cpb.rawPresentation("Valid data");
          props_ValidData = cpb.create();
        }
        return props_ValidData;
      case LanguageConceptSwitch.VerifierElement:
        if (props_VerifierElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Element in the page to verifier system status");
          cpb.presentationByName();
          props_VerifierElement = cpb.create();
        }
        return props_VerifierElement;
      case LanguageConceptSwitch.VerifierElementItemList:
        if (props_VerifierElementItemList == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("For use in references list");
          cpb.rawPresentation("Verifier Element item list to references");
          props_VerifierElementItemList = cpb.create();
        }
        return props_VerifierElementItemList;
      case LanguageConceptSwitch.VerifierElementListToImplement:
        if (props_VerifierElementListToImplement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("List for register a verifier element");
          cpb.rawPresentation("Verifier Element List");
          props_VerifierElementListToImplement = cpb.create();
        }
        return props_VerifierElementListToImplement;
      case LanguageConceptSwitch.VerifierElementListToReferences:
        if (props_VerifierElementListToReferences == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("for use in other concept for references verifiers elements");
          cpb.rawPresentation("Verifier element list to references");
          props_VerifierElementListToReferences = cpb.create();
        }
        return props_VerifierElementListToReferences;
      case LanguageConceptSwitch.WaitForCondition:
        if (props_WaitForCondition == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Wait For Condition");
          props_WaitForCondition = cpb.create();
        }
        return props_WaitForCondition;
      case LanguageConceptSwitch.WaitUntilElementIsEnabled:
        if (props_WaitUntilElementIsEnabled == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Wait Until Element Is Visible");
          props_WaitUntilElementIsEnabled = cpb.create();
        }
        return props_WaitUntilElementIsEnabled;
      case LanguageConceptSwitch.WaitUntilElementIsNotVisible:
        if (props_WaitUntilElementIsNotVisible == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Wait Until Element Is Not Visible");
          props_WaitUntilElementIsNotVisible = cpb.create();
        }
        return props_WaitUntilElementIsNotVisible;
      case LanguageConceptSwitch.WaitUntilElementIsVisible:
        if (props_WaitUntilElementIsVisible == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Wait Until Element Is Visible");
          props_WaitUntilElementIsVisible = cpb.create();
        }
        return props_WaitUntilElementIsVisible;
      case LanguageConceptSwitch.WaitUntilPageContains:
        if (props_WaitUntilPageContains == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Wait page contain respective text");
          cpb.rawPresentation("Wait Until Page Contains");
          props_WaitUntilPageContains = cpb.create();
        }
        return props_WaitUntilPageContains;
      case LanguageConceptSwitch.WaitUntilPageContainsElement:
        if (props_WaitUntilPageContainsElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Wait page contain respective Element");
          cpb.rawPresentation("Wait Until Page Contains Element");
          props_WaitUntilPageContainsElement = cpb.create();
        }
        return props_WaitUntilPageContainsElement;
      case LanguageConceptSwitch.WaitUntilPageDoesNotContain:
        if (props_WaitUntilPageDoesNotContain == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Wait page not contain respective text");
          cpb.rawPresentation("Wait Until Page Does Not Contain");
          props_WaitUntilPageDoesNotContain = cpb.create();
        }
        return props_WaitUntilPageDoesNotContain;
      case LanguageConceptSwitch.WaitUntilPageDoesNotContainElement:
        if (props_WaitUntilPageDoesNotContainElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Wait page not contain a respective Element");
          cpb.rawPresentation("Wait Until Page Does Not Contain Element");
          props_WaitUntilPageDoesNotContainElement = cpb.create();
        }
        return props_WaitUntilPageDoesNotContainElement;
    }
    return null;
  }
}
